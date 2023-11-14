import { Component } from '@angular/core';
import { LoggedService } from './services/Logged.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Proconnect';
  usuarioLogado = false

  constructor(loggedSevice: LoggedService ){
    loggedSevice.getSituacaoLoginUsuario().subscribe(estaLogado=> {this.usuarioLogado = estaLogado})
  }
}
