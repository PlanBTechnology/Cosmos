import { IAddress } from "../interfaces/iaddress";

export class Address implements IAddress{
  state: string;
  city: string;
  street: string;
  CEP: string;
  number: number;

  constructor(){
    this.state = "";
    this.city = "";
    this.street = "";
    this.CEP = "";
    this.number = 0;
  }

}
