class CreateParticipations < ActiveRecord::Migration[6.0]
  def change
    create_table :participations do |t|
      t.belongs_to :event, foreign_key: true
      t.integer :user_id
      
      t.boolean :presence

      t.timestamps
    end
  end
end
