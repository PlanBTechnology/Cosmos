import { IGender } from "../interfaces/igender";

export class Gender implements IGender{
  gender: string;
  constructor(){
    this.gender = "";
  }
}
