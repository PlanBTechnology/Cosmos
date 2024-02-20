import { Abilities } from "../Class/abilities"
import { Profileconf } from "../Class/profileconf"
import { Profilejobs } from "../Class/profilejobs"


export interface Iprofile {
    id:number
    profileconf:Profileconf
    abilities:Abilities[]
    profilejobs:Profilejobs[]
}
