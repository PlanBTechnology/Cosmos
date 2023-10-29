import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'] 
})
export class LoginComponent {
  email: string = "";
  senha: string = "";

  constructor(private http: HttpClient, private router: Router){} 
  ngOnInit(): void{}

  verificarUsuario(){
    window.alert('Verificando dados do usuário...');

    console.log('Email:', this.email);
    console.log('Senha:', this.senha);

    // Verifica a senha com a expressão regular
    const regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9!@#\$%\^&\*\(\)_\+\-=\[\]\{\};:'",<>\./?\\|]).{6,}$/;
    if (!regex.test(this.senha)) {
      window.alert('Senha fora dos padrões');
      return;
    }

    // URL do servidor
    const url = `https://64e6a1f309e64530d1801dd3.mockapi.io/api/v1/Nome?email=${this.email}&senha=${this.senha}`;

    // Faz uma solicitação GET para o servidor
    this.http.get(url).subscribe(
      (response: any) => {
        console.log(response);
        if (response.LoginOk ) {
          window.alert('Login efetuado com sucesso')
          this.router.navigate(['./pag-inicial']);
        } else {
          window.alert('Email ou Senha incorretos')
        }
      },
      error => {
        console.error(error);
        window.alert('Ocorreu um erro ao efetuar o login')
      }
    );
  }
}
// Email: test@gmail.com  Senha: Senha#