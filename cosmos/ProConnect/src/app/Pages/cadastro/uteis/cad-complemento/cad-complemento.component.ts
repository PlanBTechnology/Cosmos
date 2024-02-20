import { Component, OnInit } from '@angular/core';
import { LocalStorageService } from 'src/app/services/operations/local-storage.service';
import { User } from 'src/app/Class/user';
import { CadService } from 'src/app/services/operations/cad.service';
import { ConfigGeralServicesService } from 'src/app/services/operations/config-geral-services.service';
import { State } from 'src/app/Class/state';
import { Gender } from 'src/app/Class/gender';
import { Scholarity } from 'src/app/Class/scholarity';
import { Maritalstatus } from 'src/app/Class/maritalstatus';

@Component({
  selector: 'app-cad-complemento',
  templateUrl: './cad-complemento.component.html',
  styleUrls: ['./cad-complemento.component.css']
})
export class CadComplementoComponent implements OnInit{
  user:User = new User();
  stateDrop:State[] = [];
  genderDrop:Gender[] = [];
  scholarityDrop:Scholarity[]=[];
  maritalStatusDrop:Maritalstatus[]=[];
  selectedState = null;
  selectedGender = null;
  selectedScholarity = null;
  selectedMaritalStatus = null;
  selectExperience = null;
  selectJob = null;

  constructor(
    private storageService:LocalStorageService,
    private cadService:CadService,
    private confService:ConfigGeralServicesService){}
  ngOnInit(): void {
    this.stateDrop = this.confService.buildStateDrop();
    this.genderDrop = this.confService.buildGenderDrop();
    this.scholarityDrop = this.confService.buildScholarityDrop();
    this.maritalStatusDrop = this.confService.buildMaritalStatusDrop();
  }
  showState(){
    console.log(this.user.person.name);
    console.log(this.user.person.birthDate);
    console.log(this.user.person.CPF);
    console.log(this.user.person.cellphone);
    console.log(this.user.person.address.CEP);
    console.log(this.user.person.address.street)
    console.log(this.user.person.address.number)
    console.log(this.user.person.address.state)
    console.log(this.user.person.address.city)
    console.log(this.user.person.gender)
    console.log(this.user.person.scholarity)
    console.log(this.user.person.maritalStatus)
    console.log(this.user.profile.profileconf.homeoffice);
    console.log(this.user.profile.profileconf.working);
  }
}
