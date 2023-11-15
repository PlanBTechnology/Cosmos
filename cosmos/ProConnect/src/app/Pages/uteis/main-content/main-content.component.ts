import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-main-content',
  templateUrl: './main-content.component.html',
  styleUrls: ['./main-content.component.css']
})
export class MainContentComponent {

  @Input() posts:Array<mainPost> = []
}

export class mainPost{
  img:string = '';
  name:string = '';
  texto:string = '';
  post:string = '';

  constructor(name:string, texto:string, post:string){
    this.img = '';
    this.name = name;
    this.texto = texto;
    this.post = post;

  }
}
