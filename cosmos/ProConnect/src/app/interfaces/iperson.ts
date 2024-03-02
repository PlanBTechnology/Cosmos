import { Address } from "../Class/address";
import { IGender } from "./igender";
import { Maritalstatus } from "../Class/maritalstatus";
import { Scholarity } from "../Class/scholarity";
import { IAddress } from "./iaddress";
import { Ischolarity } from "./ischolarity";
import { Imaritalstatus } from "./imaritalstatus";

export interface IPerson {

  name:string;
  birthDate:Date;
  CPF:string;
  cellPhone:string;
  address:IAddress;
  gender:IGender;
  maritalStatus:Imaritalstatus;
  scholarity:Ischolarity;

  getName():string;
  getBirthDate():Date;
  getCPF():string
  getCellphone():string
  getAddress():IAddress
  getGender():IGender
  getMaritalStatus():Imaritalstatus
  getScholarity():Ischolarity

  setName(name:string):void
  setBirthDate(birthDate:Date):void
  setCPF(CPF:string):void
  setCellphone(cellphone:string):void
  setAddress(address:Address):void
  setGender(gender:IGender):void
  setMaritalStatus(maritalStatus:Imaritalstatus):void
  setScholarity(scholarity:Ischolarity):void

  verficaPessoa():boolean;
}
