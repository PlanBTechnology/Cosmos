export interface IState {

  stateName:string;
  id:number;

  getStateName():string;
  setStateName(stateName:string):void;

  getId():number;
  setId(id:number):void;
}
