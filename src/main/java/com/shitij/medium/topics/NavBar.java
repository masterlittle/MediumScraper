
package com.shitij.medium.topics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "navItems",
    "index"
})
public class NavBar {

    @JsonProperty("navItems")
    private List<NavItem> navItems = null;
    @JsonProperty("index")
    private long index;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("navItems")
    public List<NavItem> getNavItems() {
        return navItems;
    }

    @JsonProperty("navItems")
    public void setNavItems(List<NavItem> navItems) {
        this.navItems = navItems;
    }

    @JsonProperty("index")
    public long getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(long index) {
        this.index = index;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("navItems", navItems).append("index", index).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(index).append(navItems).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NavBar) == false) {
            return false;
        }
        NavBar rhs = ((NavBar) other);
        return new EqualsBuilder().append(index, rhs.index).append(navItems, rhs.navItems).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
