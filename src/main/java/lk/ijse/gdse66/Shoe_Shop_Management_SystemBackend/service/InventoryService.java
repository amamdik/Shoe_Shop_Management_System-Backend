package lk.ijse.gdse66.Shoe_Shop_Management_SystemBackend.service;

import lk.ijse.gdse66.Shoe_Shop_Management_SystemBackend.dto.InventoryDTO;
import lk.ijse.gdse66.Shoe_Shop_Management_SystemBackend.exception.NotFoundException;

import java.util.List;

public interface InventoryService {
    boolean saveInventory(InventoryDTO inventoryDTO, String supplier_id) throws NotFoundException;
    List<InventoryDTO> getAllInventories();
    boolean deleteInventoryById(String id) throws NotFoundException;
    boolean updateInventoryById(String id, InventoryDTO inventoryDTO) throws NotFoundException;
    String generateNextId(String occupation, String gender);
    InventoryDTO selectInventoryById(String id) throws NotFoundException;
    boolean updateImg(String itemCode, String pic);
    List<String> getSize(String itemCode);
}
