import { IAddress } from "../interfaces/iaddress";
import { IState } from "../interfaces/istate";
import { State } from "./state";

export class Address implements IAddress{

  state: IState = new State();
  city: string = '';
  street: string = '';
  CEP: string = '';
  number: number = 0;

  getCEP(): string {  return this.CEP;  }
  setCEP(CEP: string): void {  this.CEP = CEP;  }

  getNumber(): number {  return this.number;  }
  setNumber(number: number): void {  this.number = number;  }

  getCity(): string {  return this.city;  }
  setCity(city: string): void {  this.city = city;  }

  getStreet(): string {  return this.street;  }
  setStreet(street: string): void {  this.street = street;  }

  getState(): IState {  return this.state;  }
  setState(state: IState): void {  this.state = state;  }

  verificaEndereco():boolean{
    if(this.CEP.length == 8 && this.number > 0 && this.city != "" && this.street != "" && this.state.stateName != ""){
      return true;
    }
    return false;
  }

}
