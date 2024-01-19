INSERT IGNORE INTO nagoyameshi_db.store_information
(store_id, category_id, store_name, image_name, remarks, price_lower_limit, price_upper_limit, business_hours_open, business_hours_close, postal_code, address, phone_number, regular_holiday, registration_at, updated_at)
VALUES(1, 1, 'けむり', 'StoreInformation.jpg', '卵焼きが名物', 2000, 4000, '17:00', '2:00', '073-0145', '北海道砂川市西五条南X-XX-XX', '012-345-678', '水曜日', '2024-01-02 15:41:53', '2024-01-02 15:41:53');

INSERT IGNORE INTO nagoyameshi_db.category
(category_id, category_name, registration_at, updated_at)
VALUES(1, 'けむり', '2024-01-02 15:41:50', '2024-01-02 15:41:50');