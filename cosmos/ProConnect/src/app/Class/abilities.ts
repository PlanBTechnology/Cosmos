import { IAbilities } from "../interfaces/iabilities";

export class Abilities implements IAbilities{
  code: number = 0;
  name: string =  '';
  classification: string = '';
  pontuation: number = 0;

  getCode(): number {  return this.code;  }
  setCode(code: number): void {  this.code = code;  }


  getName(): string {  return this.name;  }
  setName(name: string): void {  this.name = name;  }

  getClassification(): string {  return this.classification;  }
  setClassification(classification: string): void { this.classification = classification;  }

  getPontuation(): number { return this.pontuation;  }
  setPontuation(pontuation: number): void { this.pontuation = pontuation;  }
}
