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
  readonly apiURL = 'https://64e6a1f309e64530d1801dd3.mockapi.io/api/v1/Nome/';
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
    const url = `https://64e6a1f309e64530d1801dd3.mockapi.io/api/v1/Nome/1` 

    // Faz uma solicitação GET para o servidor
    variavel = this.http.get <usuario> (url).subscribe(
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
    )
  }
  cadastra(){
    alert(this.senha)
    alert(this.email)
    var aluno = {
      email: this.email,
      senha: this.senha
    }
   this.http.post(this.apiURL, aluno)
   .subscribe(
    resultado => {
      console.log(resultado)

    },
    erro => {
      if(erro.status == 400){
        console.log(erro)
      }
    }
   )

  }
}
class usuario{
  email: string = "";
  senha: string = "";
}
// Email: test@gmail.com  Senha: Senha#