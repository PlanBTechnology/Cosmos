import { IState } from "../interfaces/istate"

export class State implements IState{
  id:number
  stateName:string

  constructor(){
    this.stateName = ""
    this.id = 0
  }
}
