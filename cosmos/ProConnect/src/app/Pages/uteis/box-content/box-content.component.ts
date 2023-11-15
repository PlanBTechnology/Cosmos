import { Token } from '@angular/compiler';
import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-box-content',
  templateUrl: './box-content.component.html',
  styleUrls: ['./box-content.component.css']
})
export class BoxContentComponent{

  @Input() titulo:String = ''
  opcao:string = ''
  numero:string = ''
  @Input() conteudos:Array<contet> = []
}

export class contet{
  titulo:string = ''
  texto:string = ''

  constructor(titulo:string, texto:string){
    this.titulo = titulo
    this.texto = texto

  }
}
