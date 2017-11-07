
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
    "streamItems",
    "heroPromos",
    "navBar",
    "references"
})
public class Payload {

    @JsonProperty("streamItems")
    private List<StreamItem> streamItems = null;
    @JsonProperty("heroPromos")
    private List<Object> heroPromos = null;
    @JsonProperty("navBar")
    private NavBar navBar;
    @JsonProperty("references")
    private References references;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("streamItems")
    public List<StreamItem> getStreamItems() {
        return streamItems;
    }

    @JsonProperty("streamItems")
    public void setStreamItems(List<StreamItem> streamItems) {
        this.streamItems = streamItems;
    }

    @JsonProperty("heroPromos")
    public List<Object> getHeroPromos() {
        return heroPromos;
    }

    @JsonProperty("heroPromos")
    public void setHeroPromos(List<Object> heroPromos) {
        this.heroPromos = heroPromos;
    }

    @JsonProperty("navBar")
    public NavBar getNavBar() {
        return navBar;
    }

    @JsonProperty("navBar")
    public void setNavBar(NavBar navBar) {
        this.navBar = navBar;
    }

    @JsonProperty("references")
    public References getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(References references) {
        this.references = references;
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
        return new ToStringBuilder(this).append("streamItems", streamItems).append("heroPromos", heroPromos).append("navBar", navBar).append("references", references).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(references).append(navBar).append(additionalProperties).append(heroPromos).append(streamItems).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payload) == false) {
            return false;
        }
        Payload rhs = ((Payload) other);
        return new EqualsBuilder().append(references, rhs.references).append(navBar, rhs.navBar).append(additionalProperties, rhs.additionalProperties).append(heroPromos, rhs.heroPromos).append(streamItems, rhs.streamItems).isEquals();
    }

}
