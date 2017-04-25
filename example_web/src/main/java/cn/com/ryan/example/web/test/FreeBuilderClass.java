package cn.com.ryan.example.web.test;

import org.inferred.freebuilder.FreeBuilder;

/**
 * FreeBuilderClass
 *
 * @author Li Yan[liyan0311@autohome.com.cn]
 * @date 17-4-7
 */
@FreeBuilder
public class FreeBuilderClass {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
