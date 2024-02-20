import { IProfileconf } from "../interfaces/iprofileconf";

export class Profileconf implements IProfileconf{
  id: number;
  working: boolean;
  homeoffice: boolean;
  salaryexpectation: number;

  constructor(){
    this.id = 0;
    this.working = false;
    this.homeoffice = false;
    this.salaryexpectation = 0;
  }

}
