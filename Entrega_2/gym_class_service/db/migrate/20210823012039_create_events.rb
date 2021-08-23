class CreateEvents < ActiveRecord::Migration[6.1]
  def change
    create_table :events do |t|
      t.belongs_to :gym_class, foreign_key: true
      
      t.datetime :date
      t.integer :max_people_allowed
      t.string :gym_class_teacher
      t.string :type_of_plan

      t.timestamps
    end
  end
end
