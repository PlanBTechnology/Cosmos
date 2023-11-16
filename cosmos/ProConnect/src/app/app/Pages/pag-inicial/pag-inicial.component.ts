import { Component, OnInit, Output, EventEmitter, Input } from '@angular/core';
import {contet} from '../uteis/box-content/box-content.component';
import {mainPost} from '../uteis/main-content/main-content.component';




@Component({
  selector: 'app-pag-inicial',
  templateUrl: './pag-inicial.component.html',
  styleUrls: ['./pag-inicial.component.css']
})
export class PagInicialComponent {

  conteudo1 = new contet("HTML 5", "12 Perguntas")
  conteudo2 = new contet("C#", "12 Perguntas")
  conteudo3 = new contet("Java", "15 Perguntas")
  conteudo4 = new contet("Angular", "15 Perguntas")

  conteudo5 = new contet("MEI Ajuda", "React")
  conteudo6 = new contet("Cosmo", "Java/SpringBoot")
  conteudo7 = new contet("PdvTech", "JavaFX")
  conteudo8 = new contet("ProConnect", "Angular")

  posts:Array<mainPost> = [new mainPost("Yago", "Bem vindo a minhas ferias", "../../assets/paisagem-natural.jpg"),]
  titulo1 = new BoxTemplate("Sugestões de Teste de Competência:")
  titulo2 = new BoxTemplate("Resumos dos Projetos:")
  conteudos:Array<contet> = [this.conteudo1, this.conteudo2, this.conteudo3, this.conteudo4]
  conteudos2:Array<contet> = [this.conteudo5, this.conteudo6, this.conteudo7, this.conteudo8]
}

class BoxTemplate{
  titulo:String = ''
  constructor(titulo:string){
    this.titulo = titulo
  }
}

