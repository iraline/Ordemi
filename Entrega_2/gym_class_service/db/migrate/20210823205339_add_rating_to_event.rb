class AddRatingToEvent < ActiveRecord::Migration[6.1]
  def change
    add_column :events, :rating, :integer
  end
end
