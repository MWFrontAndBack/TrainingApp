INSERT INTO normaluser (id, first_name, last_name, birth_date, height, weight, mail, photo) VALUES
       (1, 'John', 'Doe', '1990-01-01', 180.0, 80.0, 'john.doe@example.com', 'https://example.com/photo.jpg');

INSERT INTO training (id_training, name, photo, description, normal_user_id) VALUES
                                                                                    (1, 'Chest workout', 'https://example.com/chest.jpg', 'This workout targets your chest muscles', 1),
                                                                                    (2, 'Back workout', 'https://example.com/back.jpg', 'This workout targets your back muscles', 1);

INSERT INTO excercise (id, name, photo, calories, training_type, training_id) VALUES
                                                                                 (1, 'Bench press', 'https://example.com/bench_press.jpg', 100, 'PRE_WORKOUT', 1),
                                                                                 (2, 'Push ups', 'https://example.com/push_ups.jpg', 50, 'POST_WORKOUT', 1),
                                                                                 (3, 'Pull ups', 'https://example.com/pull_ups.jpg', 70, 'SNACK', 2);
