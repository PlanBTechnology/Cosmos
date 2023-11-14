import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { IUsuario } from '../interfaces/iusuario';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class usuarioService {

  constructor(private httpClient: HttpClient,
              private router: Router) { }





              logar(usuario: IUsuario) : Observable<any>{
                return this.httpClient.post('http://localhost:3000/usuario/login', usuario);
              }
              deslogar(){
                this.router.navigate(['/login']);

              }
}
