import { IJob } from "../interfaces/ijob";

export class Job implements IJob{
  jobId: number;
  jobName: string;

  constructor(){
    this.jobId = 0;
    this.jobName = "";
  }
}
