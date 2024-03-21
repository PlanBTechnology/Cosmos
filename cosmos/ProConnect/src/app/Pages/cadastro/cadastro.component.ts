import { Component } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { OnInit } from '@angular/core';
import { CadService } from 'src/app/services/operations/cad.service';
import { HttpClient } from '@angular/common/http';
import { LocalStorageService } from 'src/app/services/operations/local-storage.service';


@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css'],
  providers: [CadService, LocalStorageService]
})
export class CadastroComponent implements OnInit{
  teste:string[] = ['tgbNymZ7vqY', '0Y5kKMAkKjc'];
  constructor(private http:HttpClient, private storageService:LocalStorageService, cadService:CadService){}
  ngOnInit(): void {

  }
  etapaCadastro:boolean = false;

proximoPassao(valor:boolean){
  this.etapaCadastro = valor;
}
}
