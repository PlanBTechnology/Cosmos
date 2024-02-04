import { Address } from "../Class/address";

export interface IPessoa {
  name:string;
  birthDate:Date
  CPF:string;
  cellphone:string;
  address:Address;
  gender:string;
  matrialStatus:string;
  scolarity:string;
}
