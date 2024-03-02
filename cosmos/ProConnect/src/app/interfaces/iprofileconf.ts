export interface IProfileconf {
  id: number;
  working: boolean;
  homeoffice: boolean;
  salaryexpectation: number;


  getId(): number;
  getWorking(): boolean;
  getHomeoffice(): boolean;
  getSalaryexpectation(): number;

  setId(id: number): void;
  setWorking(working: boolean): void;
  setHomeoffice(homeoffice: boolean): void;
  setSalaryexpectation(salaryexpectation: number): void;
}
