package lk.ijse.gdse66.Shoe_Shop_Management_SystemBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItemDTO {
    private String item_id;
    private String item_name;
    private int item_size;
    private int quantity;
    private double unit_price;
    private double total_price;
}