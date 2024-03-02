import { IProfileconf } from "../interfaces/iprofileconf";

export class Profileconf implements IProfileconf{
  id: number = 0;
  working: boolean = false;
  homeoffice: boolean = false;
  salaryexpectation: number = 0;


  public getHomeoffice(): boolean {return this.homeoffice  }
  public setHomeoffice(homeoffice: boolean): void { this.homeoffice = homeoffice; }

  public getWorking(): boolean { return this.working}
  public setWorking(working: boolean): void { this.working = working; }

  public getSalaryexpectation(): number { return this.salaryexpectation  }
  public setSalaryexpectation(salaryexpectation: number): void { this.salaryexpectation = salaryexpectation; }

  public getId(): number { return this.id}
  public setId(id: number): void { this.id = id; }
}
