import { IPessoa } from "../interfaces/ipessoa";
import { Address } from "./address";

export class Pessoa implements IPessoa{
  name: string;
  birthDate: Date;
  CPF: string;
  cellphone: string;
  address: Address;
  gender: string;
  matrialStatus: string;
  scolarity: string;

constructor(){
  this.address = new Address();
  this.name = "";
  this.birthDate = new Date();
  this.CPF = "";
  this.cellphone = "";
  this.gender = "";
  this.matrialStatus = "";
  this.scolarity = "";

}

}
