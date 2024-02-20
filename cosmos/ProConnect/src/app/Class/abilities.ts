import { IAbilities } from "../interfaces/iabilities";

export class Abilities implements IAbilities{
  code: number;
  name: string;
  classification: string;
  pontuation: number;

  constructor(){
    this.code = 0;
    this.name = "";
    this.classification = "";
    this.pontuation = 0;
  }
}
