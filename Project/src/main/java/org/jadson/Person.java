package org.jadson;

import org.apache.commons.collections.list.GrowthList;

/**
 * 
 * @author jadson santos 3
 *
 * <p><i>This program is distributed without any warranty and it
 * can be freely redistributed for research, classes or private studies, 
 * since the copyright notices are not removed.</i></p>
 *
 */
public class Person {
    private final String name;

    /**
     * Nome da pessoa
     * @param name
     */
    public Person(String name) {
        this.name = name.concat("!");
        new GrowthList();
    }

    public String getName() {
        return name;
    }
}
