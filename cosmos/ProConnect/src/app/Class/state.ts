import { IState } from "../interfaces/istate"

export class State implements IState{
  id:number = 0;
  stateName:string= '';

  public getStateName(): string {return this.stateName}
  public setStateName(stateName: string): void {this.stateName = stateName}

  public getId(): number {return this.id}
  public setId(id: number): void {this.id = id}
}
