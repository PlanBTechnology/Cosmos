import { Address } from "../Class/address";
import { Gender } from "../Class/gender";
import { Maritalstatus } from "../Class/maritalstatus";
import { Scholarity } from "../Class/scholarity";

export interface IPessoa {
  name:string;
  birthDate:Date
  CPF:string;
  cellphone:string;
  address:Address;
  gender:Gender;
  maritalStatus:Maritalstatus;
  scholarity:Scholarity;
}
