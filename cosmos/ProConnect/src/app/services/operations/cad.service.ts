import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from 'src/app/Class/user';
import { Observable } from 'rxjs';
import { LocalStorageService } from './local-storage.service';

@Injectable({
  providedIn: 'root'
})
export class CadService {


  constructor(private http:HttpClient, private storageService:LocalStorageService) { }
  addUser(usuario:User):Observable<User>{
    const url  = `http://localhost:8080/user/`
    return this.http.post<User>(url,usuario)
  }
  salvaUser(User:User){
    this.storageService.setData('user',User);
  }

  getUser():User{
    return this.storageService.getData('user');
  }
  updateUser(User:User){
this.storageService.setData('user', User)
  }

  verificaSenha(senha:string):boolean{
    const regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9!@#\$%\^&\*\(\)_\+\-=\[\]\{\};:'",<>\./?\\|]).{6,}$/;
    if(regex.test(this.getUser().getPassword())){
      if(this.getUser().getPassword() === senha){
        return true;
      }
      else{
        alert("As senhas não conhecidem");
      }
    }else{
      alert("A senha está fora dos padrões estabelecidos pela plataforma");
    }
    return false;
  }
}


