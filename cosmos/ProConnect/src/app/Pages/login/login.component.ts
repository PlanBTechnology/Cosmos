import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { PincipalNavBarComponent } from '../uteis/pincipal-nav-bar/pincipal-nav-bar.component';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent {
  email: string = "";
  senha: string = "";
  estado = new PincipalNavBarComponent;
  constructor(private http: HttpClient, private router: Router){}
  ngOnInit(): void{}

  verificarUsuario(){
    window.alert('Verificando dados do usuário...');
    var variavel;
    console.log('Email:', this.email);
    console.log('Senha:', this.senha);

    // Verifica a senha com a expressão regular
    const regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9!@#\$%\^&\*\(\)_\+\-=\[\]\{\};:'",<>\./?\\|]).{6,}$/;
    if (!regex.test(this.senha)) {
      window.alert('Senha fora dos padrões');
      return;
    }

    // URL do servidor
    const url = `https://64e6a1f309e64530d1801dd3.mockapi.io/api/v1/Nome?email=${this.email}`

    variavel = this.http.get<usuario[]>(url).subscribe(
      (response: usuario[]) => {
        console.log(response);

        // Encontrar o usuário com o email fornecido na resposta
        const user = response.find(user => user.email === this.email);

        if (user) {
          // Usuário encontrado, agora compare as senhas
          if (user.senha === this.senha) {
            window.alert('Login efetuado com sucesso');
            this.router.navigate(['/home']);
            this.estado.changeStatus();
          } else {
            window.alert('Email ou senha Incorretos');
          }
        } else {
          // Usuário não encontrado
          window.alert('Usuário não encontrado');
        }
      },
      error => {
        console.error(error);
        window.alert('Ocorreu um erro ao efetuar o login');
      }
    );
  }
}
// Email: test@gmail.com  Senha: Senha#
class usuario{
  email: string = "";
  senha: string = "";
}
// Email: test@gmail.com  Senha: Senha#
