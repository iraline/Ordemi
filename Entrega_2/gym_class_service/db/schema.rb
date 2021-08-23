# This file is auto-generated from the current state of the database. Instead
# of editing this file, please use the migrations feature of Active Record to
# incrementally modify your database, and then regenerate this schema definition.
#
# This file is the source Rails uses to define your schema when running `bin/rails
# db:schema:load`. When creating a new database, `bin/rails db:schema:load` tends to
# be faster and is potentially less error prone than running all of your
# migrations from scratch. Old migrations may fail to apply correctly if those
# migrations use external dependencies or application code.
#
# It's strongly recommended that you check this file into your version control system.

ActiveRecord::Schema.define(version: 2021_08_23_205339) do

  create_table "events", charset: "utf8mb4", force: :cascade do |t|
    t.bigint "gym_class_id"
    t.datetime "date"
    t.integer "max_people_allowed"
    t.string "gym_class_teacher"
    t.string "type_of_plan"
    t.datetime "created_at", precision: 6, null: false
    t.datetime "updated_at", precision: 6, null: false
    t.integer "rating"
    t.index ["gym_class_id"], name: "index_events_on_gym_class_id"
  end

  create_table "gym_classes", charset: "utf8mb4", force: :cascade do |t|
    t.string "name"
    t.text "description"
    t.string "note"
    t.datetime "created_at", precision: 6, null: false
    t.datetime "updated_at", precision: 6, null: false
  end

  create_table "participations", charset: "utf8mb4", force: :cascade do |t|
    t.bigint "event_id"
    t.integer "user_id"
    t.boolean "presence"
    t.datetime "created_at", precision: 6, null: false
    t.datetime "updated_at", precision: 6, null: false
    t.index ["event_id"], name: "index_participations_on_event_id"
  end

  add_foreign_key "events", "gym_classes"
  add_foreign_key "participations", "events"
end
