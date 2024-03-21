import { Component, OnInit, Input } from '@angular/core';
import { LocalStorageService } from 'src/app/services/operations/local-storage.service';
import { User } from 'src/app/Class/user';
import { CadService } from 'src/app/services/operations/cad.service';
import { ConfigGeralServicesService } from 'src/app/services/operations/config-geral-services.service';
import { State } from 'src/app/Class/state';
import { Gender } from 'src/app/Class/gender';
import { Scholarity } from 'src/app/Class/scholarity';
import { Maritalstatus } from 'src/app/Class/maritalstatus';
import { Job } from 'src/app/Class/job';

@Component({
  selector: 'app-cad-complemento',
  templateUrl: './cad-complemento.component.html',
  styleUrls: ['./cad-complemento.component.css']
})


export class CadComplementoComponent implements OnInit{
  user:User = new User();

  //Drops
  stateDrop:State[] = [];
  genderDrop:Gender[] = [];
  scholarityDrop:Scholarity[]=[];
  maritalStatusDrop:Maritalstatus[]=[];
  jobDrop:Job[] = [];


  terms:boolean = false;
  //Drop selection
  selectedState:State | null  = null;
  selectedGender = null;
  selectedScholarity = null;
  selectedMaritalStatus = null;
  selectExperience = null;
  selectJob = null;

  teste='tgbNymZ7vqY'
  exibition=true
  @Input() txte:string[] = [];

  constructor(

    private storageService:LocalStorageService,
    private cadService:CadService,
    private confService:ConfigGeralServicesService){

    }
  ngOnInit(): void {

  }

  cadastar(){
    if(this.user.person.name != ('' || null)){

    }
    console.log('teste')
    console.log(this.terms)
  }
  changeScholaity(scholarity:Scholarity){
    this.user.getPerson().setScholarity(scholarity);
  }

  changeMaritalStatus(maritalStatus:Maritalstatus){
    this.user.getPerson().setMaritalStatus(maritalStatus);
  }

  changeGender(gender:Gender){
    this.user.getPerson().setGender(gender);
  }

  changeState(state:State){
    this.user.getPerson().getAddress().setState(state);
  }

  verifyTerms(){
    console.log()
  }

  parseDate(dateString:string): Date{

    if(dateString != null){
      console.log(dateString)
    let dateSplit:string[] = dateString.split('-');
    dateSplit.forEach(x => console.log(x))
    return new Date(parseInt(dateSplit[0]), parseInt(dateSplit[1]) - 1, parseInt(dateSplit[2]));
    }
    return new Date();
  }

  changeExibition(){
    if(this.exibition){
      this.teste = 'tgbNymZ7vqY'
    }
    else{
      this.teste = '0Y5kKMAkKjc'
    }
    this.exibition = !this.exibition

  }
}
