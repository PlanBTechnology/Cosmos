import { IGender } from "../interfaces/igender";

export class Gender implements IGender{
  gender: string;
  id:number;
  constructor(){
    this.gender = "";
    this.id = 0;
  }
}
