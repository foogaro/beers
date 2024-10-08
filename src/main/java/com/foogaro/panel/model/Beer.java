package com.foogaro.panel.model;

import com.redis.om.spring.annotations.Indexed;
import com.redis.om.spring.annotations.NumericIndexed;
import com.redis.om.spring.annotations.SchemaFieldType;
import com.redis.om.spring.annotations.Searchable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@RedisHash("beer")
public class Beer {

    @Id
    private String id;
    @NumericIndexed(sortable = true)
    private String abv; //Alcohol by volume (ABV).
    private Integer available_id;
    private String beer_variation_id;
    private String create_date;
    private String description;
    private String food_parings;
    private Integer glassware_id;
    @NumericIndexed(sortable = true)
    private String ibu; //Bitterness
    private String is_organic;
    private String is_retired;
    @Searchable
    private String name;
    private String name_display;
    private String original_gravity;
    private String serving_temperature;
    private String serving_temperature_display;
    private Integer srm_id;
    private String status;
    private String status_display;
    private Integer style_id;
    private String update_date;
    private Integer year;

}
