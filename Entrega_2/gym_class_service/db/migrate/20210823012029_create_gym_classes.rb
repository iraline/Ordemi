class CreateGymClasses < ActiveRecord::Migration[6.1]
  def change
    create_table :gym_classes do |t|
      t.string :name
      t.text :description
      t.string :note

      t.timestamps
    end
  end
end
