import { Component, Output, EventEmitter } from '@angular/core';
import { LocalStorageService } from 'src/app/services/operations/local-storage.service';
import { User } from 'src/app/Class/user';
import { CadService } from 'src/app/services/operations/cad.service';



@Component({
  selector: 'app-cad-menu',
  templateUrl: './cad-menu.component.html',
  styleUrls: ['./cad-menu.component.css'],
  providers:[LocalStorageService]
})
export class CadMenuComponent {
  user:User = new User();
  verificaSenha:string='';
  constructor(private storageService:LocalStorageService, private cadService:CadService){}


  @Output() continuaCada = new EventEmitter<boolean>();
  passaCad(){
    this.cadService.salvaUser(this.user);
    console.log(this.user);
    console.log(this.verificaSenha);
    if(this.cadService.verificaSenha(this.verificaSenha)){
      this.continuaCada.emit(true);
    }
  }
}
