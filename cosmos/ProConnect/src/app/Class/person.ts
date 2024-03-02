import { IAddress } from "../interfaces/iaddress";
import { IGender } from "../interfaces/igender";
import { Imaritalstatus } from "../interfaces/imaritalstatus";
import { IPerson } from "../interfaces/iperson";
import { Ischolarity } from "../interfaces/ischolarity";
import { Address } from "./address";
import { Gender } from "./gender";
import { Maritalstatus } from "./maritalstatus";
import { Scholarity } from "./scholarity";

export class Person implements IPerson{

  name:string = "";
  birthDate:Date = new Date();
  CPF:string = "";
  address:IAddress = new Address();
  gender:IGender = new Gender();
  cellPhone:string = "";
  maritalStatus:Imaritalstatus = new Maritalstatus();
  scholarity:Ischolarity = new Scholarity();


  public getName(): string {return this.name;}
  public setName(name: string): void {this.name = name;}

  public getBirthDate(): Date {return this.birthDate;}
  public setBirthDate(birthDate: Date): void {this.birthDate = birthDate;}

  public getCPF(): string {return this.CPF;}
  public setCPF(CPF: string): void {this.CPF = CPF;}

  public getCellphone(): string {return this.cellPhone;}
  public setCellphone(cellphone: string): void {this.cellPhone = cellphone;}

  public getAddress(): IAddress {return this.address;}
  public setAddress(address: IAddress): void {this.address = address;}

  public getGender(): IGender {return this.gender;}
  public setGender(gender: IGender): void {this.gender = gender;}

  public getMaritalStatus(): Imaritalstatus {return this.maritalStatus;}
  public setMaritalStatus(maritalStatus: Imaritalstatus): void {this.maritalStatus = maritalStatus;}

  public getScholarity(): Ischolarity {return this.scholarity;}
  public setScholarity(scholarity: Ischolarity): void {this.scholarity = scholarity;}

  public verficaPessoa():boolean{
    if(this.name == ""){
      throw new Error("Nome inválido");
    }
    if(this.CPF == ""){
      throw new Error("CPF inválido");
    }
    if(this.cellPhone == ""){
      throw new Error("Telefone inválido");
    }
    if(this.address.verificaEndereco() == false){
      throw new Error("Endereço inválido");
    }
    if(this.gender.verificagenero() == false){
      throw new Error("Gênero inválido");
    }
    if(this.maritalStatus == null){
      throw new Error("Estado civil inválido");
    }
    if(this.scholarity == null){
      throw new Error("Escolaridade inválida");
    }
    return true;
  }

}
