import { Ischolarity } from "../interfaces/ischolarity";

export class Scholarity implements Ischolarity{
  scholarity: string = '';
  id: number = 0;


  public  getId(): number { return this.id}
  public setId(id: number): void {this.id = id}

  public getScholarityTitle(): string {return this.scholarity}
  public setScholarityTitle(scholarity: string): void {this.scholarity = scholarity}
}
