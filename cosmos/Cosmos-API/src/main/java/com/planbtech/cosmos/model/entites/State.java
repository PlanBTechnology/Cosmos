package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IState;
import jakarta.persistence.*;


@Entity
@Table(name="states")
public class State implements IState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="state_id")
    private Long id;

    @Column(name="state")
    private String stateName;

    public State() {
    }

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", stateName='" + stateName + '\'' +
                '}';
    }


    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getStateName() {
        return this.stateName;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
