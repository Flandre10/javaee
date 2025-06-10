-- Insert 1 role
INSERT INTO role (id, name, description) VALUES (1, 'Tester', 'Test Role');

-- Insert 1 user
INSERT INTO user (username, openid, password, avatar_url, role_id, coins, create_time, update_time)
VALUES ('testuser_api', 'openid_test_api', '$2a$10$abcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdef', null, 1, 100, NOW(), NOW());

-- Insert 1 sprite
INSERT INTO sprite (id, name, type, description) VALUES (1, 'Test Sprite', 'Fire', 'Test description');

-- Insert 1 user_sprite
INSERT INTO user_sprite (user_id, sprite_id, level, experience) VALUES (1, 1, 1, 0);

-- Insert 1 transaction
INSERT INTO transaction (id, user_id, type, amount, description, create_time) VALUES (1, 1, 'Purchase', 100, 'Test Transaction', NOW());

-- Insert 1 system_log
INSERT INTO system_log (id, user_id, action, description, create_time) VALUES (1, 1, 'Test Action', 'Test log entry', NOW());

-- Insert 1 battle_record
INSERT INTO battle_record (id, user_id, opponent_id, result, battle_time) VALUES (1, 1, 2, 'WIN', NOW());

-- Insert 1 rank
INSERT INTO rank (user_id, score, rank) VALUES (1, 1000, 1);
