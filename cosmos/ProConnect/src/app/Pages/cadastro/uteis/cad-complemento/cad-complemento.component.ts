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
  phoneNumber = 0;
  userName = ''
  userBirthDate = null;
  userCPF = '';
  userCEP = '';


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
    console.log(this.selectedState);
    console.log(this.userCEP);
  }


}
