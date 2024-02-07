import { IPessoa } from "../interfaces/ipessoa";
import { Address } from "./address";
import { Gender } from "./gender";
import { Maritalstatus } from "./maritalstatus";
import { Scholarity } from "./scholarity";

export class Pessoa implements IPessoa{
  name: string;
  birthDate: Date;
  CPF: string;
  cellphone: string;
  address: Address;
  gender: Gender;
  matrialStatus: Maritalstatus;
  scolarity: Scholarity;

constructor(){
  this.address = new Address();
  this.name = "";
  this.birthDate = new Date();
  this.CPF = "";
  this.cellphone = "";
  this.gender = new Gender();
  this.matrialStatus = new Maritalstatus();
  this.scolarity = new Scholarity();

}

}
