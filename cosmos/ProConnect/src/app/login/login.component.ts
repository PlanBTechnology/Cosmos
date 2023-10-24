import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'] 
})
export class LoginComponent {
  email: String = "";
  senha: String = "";

  constructor(private http: HttpClient, private router: Router){} 
  ngOnInit(): void{}

  verificarUsuario(){
    this.http.post('https://64e6a1f309e64530d1801dd3.mockapi.io/api/v1/Nome', { email: this.email, senha: this.senha })
      .subscribe((response: any) => {
        console.log(response);
        if (response.LoginOk){
          this.router.navigate(['./pag-inicial']);
        }
        else { 

        }
  },
  error => {
    console.error(error);
  });
}
}

//const regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9!@#\$%\^&\*\(\)_\+\-=\[\]\{\};:'",<>\./?\\|]).{6,}$/;//