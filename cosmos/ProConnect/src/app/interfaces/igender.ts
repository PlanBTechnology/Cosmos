export interface IGender {

  gender: string;
  id: number;

  getGender(): string;
  setGender(gender: string): void;

  getId(): number;
  setId(id: number): void;

  verificagenero():boolean;

}
