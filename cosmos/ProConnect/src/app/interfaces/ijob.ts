export interface IJob {

  jobId:number
  jobName:string


  getJobId():number
  setJobId(jobId:number):void

  getJobName():string
  setJobName(jobName:string):void
}
