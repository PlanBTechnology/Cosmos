export interface IAbilities {

  code:number
  name:string
  clssification:string
  pontuation:number

  getCode():number
  getName():string
  getClassification():string
  getPontuation():number

  setCode(code:number):void
  setName(name:string):void
  setClassification(classification:string):void
  setPontuation(pontuation:number):void
}
