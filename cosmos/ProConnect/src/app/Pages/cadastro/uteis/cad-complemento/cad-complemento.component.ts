import { Component, OnInit } from '@angular/core';
import { LocalStorageService } from 'src/app/services/operations/local-storage.service';
import { User } from 'src/app/Class/user';
import { CadService } from 'src/app/services/operations/cad.service';
import { ConfigGeralServicesService } from 'src/app/services/operations/config-geral-services.service';
import { State } from 'src/app/Class/state';
@Component({
  selector: 'app-cad-complemento',
  templateUrl: './cad-complemento.component.html',
  styleUrls: ['./cad-complemento.component.css']
})
export class CadComplementoComponent implements OnInit{
  user:User = new User();
  stateDrop:State[] = [];
  placeholder:State = new State();
  constructor(
    private storageService:LocalStorageService,
    private cadService:CadService,
    private confService:ConfigGeralServicesService){}
  ngOnInit(): void {
    this.placeholder = this.user.person.address.state;
    this.stateDrop = this.confService.MontaStateDrop();
  }
  showState(){
    console.log(this.user.person.address.state);
  }

}
